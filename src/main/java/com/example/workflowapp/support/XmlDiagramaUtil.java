package com.example.workflowapp.support;

/**
 * Utilidades para regenerar el XML del diagrama (processes.path) cuando se copia
 * un proceso existente. El motor de ejecuci�n legacy resuelve la definici�n por el
 * atributo name del {@code <process-definition>} y por processId, por lo que una
 * copia que arrastre los valores del origen deja al motor sin poder cerrar el flujo.
 */
public final class XmlDiagramaUtil {

	private XmlDiagramaUtil() {
	}

	/**
	 * Reemplaza el primer nombre de definici�n ({@code name="..."}) del diagrama.
	 * El primer {@code name} de la definici�n es el del elemento ra�z
	 * {@code <process-definition>}, no el de los nodos.
	 */
	public static String regenerarNombre(String path, String nuevoNombre) {
		if (path == null || nuevoNombre == null) {
			return path;
		}
		return path.replaceFirst("name=\"[^\"]*\"", "name=\"" + escaparAtributo(nuevoNombre) + "\"");
	}

	/**
	 * Reemplaza el {@code processId="..."} del diagrama por el id real del proceso.
	 */
	public static String regenerarProcessId(String path, int nuevoProcessId) {
		if (path == null) {
			return path;
		}
		return path.replaceFirst("processId=\"[^\"]*\"", "processId=\"" + nuevoProcessId + "\"");
	}

	/**
	 * Regenera el diagrama completo para la definici�n copiada: nombre y processId.
	 */
	public static String regenerarDiagrama(String path, String nuevoNombre, int nuevoProcessId) {
		String xml = regenerarNombre(path, nuevoNombre);
		return regenerarProcessId(xml, nuevoProcessId);
	}

	private static String escaparAtributo(String valor) {
		return valor.replace("&", "&amp;").replace("\"", "&quot;")
				.replace("'", "&apos;").replace("<", "&lt;").replace(">", "&gt;");
	}
}