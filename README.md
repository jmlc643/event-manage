<h1>Registro de Eventos</h1>

Hola soy José María Luyo Campos, creador de esta API para el registro de eventos en el cual se puede registrar eventos con título, fecha y descripción, almacenar los datos en una Base de Datos y ver estos mismos.

He usado GitHub Copilot para ahorrar tiempo en eventos simples.

## Tecnologías Utilizadas

- **Spring Boot**: Para el desarrollo del backend.
- **GitHub Desktop**: Para el control de versiones en la plataforma GitHub.

## Requisitos Previos

- Java Development Kit (JDK) 11 o superior.
- Maven.
- MySQL.
- Git y GitHub Desktop.

## Configuración del Proyecto

1. Clona el repositorio:

    ```sh
    git clone https://github.com/tu-usuario/event-manage.git
    cd event-manage
    ```

2. Configura la base de datos MySQL:

    - Crea una base de datos llamada `event_manage`.
    - Ejecuta el script SQL `schema.sql` para crear la tabla `events` y agregar datos de prueba.

    ```sh
    mysql -u your_username -p < src/main/resources/schema.sql
    ```

3. Configura las propiedades de la aplicación:

    - Abre el archivo [application.properties](http://_vscodecontentref_/1) y asegúrate de que las propiedades de conexión a la base de datos sean correctas.

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/event_manage
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    server.address=192.168.1.160
    server.port=8080
    ```

4. Compila y ejecuta la aplicación:

    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

5. Accede a la API:

    - La API estará disponible en `http://192.168.1.160:8080`.

## Endpoints Disponibles

- **GET /event/list/**: Lista todos los eventos.
- **GET /event/{id}**: Obtiene un evento por su ID.
- **POST /event/create/**: Crea un nuevo evento.

## Contribuciones

Si deseas contribuir a este proyecto, por favor, haz un fork del repositorio y envía un pull request con tus cambios.

## Licencia

Este proyecto está bajo la Licencia MIT.