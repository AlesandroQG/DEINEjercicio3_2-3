# Ejercicio 3_2 3 - Supermercado
## DM2 DEIN 2024-2025
### Alesandro Quirós Gobbato

Esta es una aplicación hecha con JavaFX y JasperReports que muestra varios informes de un supermercado.

JasperReport está compilado en 7.0.1. La ejecución funciona en VSCode.

#### Estructura

La estructura del proyecto es la siguiente:
- `src > main`:
    - `java > com.alesandro.ejercicio3_23`:
        - `SupermercadoApplicacion.java`: Clase que lanza la aplicación
        - `controller`:
          - `SupermercadoController.java`: Clase que controla los eventos de la ventana principal de la aplicación
        - `dao`:
          - `DaoProducto.java`: Clase que realiza las operaciones con la base de datos del modelo Producto
          - `DaoSeccion.java`: Clase que realiza las operaciones con la base de datos del modelo Sección
        - `db`:
          - `DBConnect.java`: Clase que se conecta a la base de datos
        - `model`:
          - `Producto.java`: Clase que define el objeto Producto
          - `Sección.java`: Clase que define el objeto Sección
    - `resources > com.alesandro.ejercicio3_23`:
        - `fxml`:
          - `Supermercado.fxml`: Ventana principal de la aplicación
        - `images`: Carpeta que contiene las imágenes de la aplicación
        - `reports`:
          - `InformeProductos.jasper`: Fichero del informe de JasperReport de productos
          - `InformeProductos.jrxml`: Fichero para la edición del informe de JasperReport en JasperStudio de productos
          - `InformeSecciones.jasper`: Fichero del informe de JasperReport de las secciones
          - `InformeSecciones.jrxml`: Fichero para la edición del informe de JasperReport en JasperStudio de las secciones
          - `SubinformeProductos.jrxml`: Fichero de JasperReport para la edición del subinforme en JasperStudio a usar en el informe de las secciones
          - `InformeTablaProductos.jasper`: Fichero del informe de JasperReport de tabla productos
          - `InformeTablaProductos.jrxml`: Fichero para la edición del informe de JasperReport en JasperStudio de tabla productos
          - `InformeGraficos.jasper`: Fichero del informe de JasperReport de gráficos
          - `InformeGraficos.jrxml`: Fichero para la edición del informe de JasperReport en JasperStudio de gráficos
        - `sql`:
          - `supermercado.sql`: Fichero para la creación de la base de datos
