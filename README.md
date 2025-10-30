# 🏠 Electrónica Doméstica - API REST

API REST para sistema de gestión de tienda de electrónica doméstica construida con Java, Javalin y Arquitectura Hexagonal.

## 🏗️ Arquitectura

Este proyecto utiliza **Arquitectura Hexagonal (Ports & Adapters)** con la siguiente estructura:
```
electronica-domestica/
├── src/main/java/com/electronicadomestica/
├── domain/             # Entidades y lógica de negocio
├── application/        # Casos de uso
└── infrastructure/     # Controllers, BD, JWT               
├── shared/                 # Código compartido
└── config/                 # Configuración
└── src/test/                   # Tests
```

## 🚀 Tecnologías

- **Java 17+**
- **Javalin 5.6.3** - Framework web ligero
- **Maven** - Gestión de dependencias
- **JWT** - Autenticación
- **BCrypt** - Encriptación de contraseñas
- **Jackson** - Serialización JSON

## 📋 Prerrequisitos

- JDK 17 o superior
- Maven 3.6+
- IntelliJ IDEA (recomendado)

## ⚙️ Configuración

1. **Clonar el repositorio**
```bash
git clone https://github.com/tu-usuario/electronica-domestica.git
cd electronica-domestica
```

2. **Configurar variables de entorno**
```bash
# Copiar el archivo de ejemplo
copy .env.example .env

# Editar .env con tus credenciales
```

3. **Instalar dependencias**
```bash
mvn clean install
```

4. **Ejecutar el proyecto**
```bash
mvn exec:java
```

O desde IntelliJ: Run → Main.java

## 🔌 Endpoints

### Auth
- `POST /api/auth/register` - Registrar nuevo usuario
- `POST /api/auth/login` - Iniciar sesión
- `POST /api/auth/recover-password` - Recuperar contraseña

### Pedidos
- `GET /api/pedidos` - Listar pedidos
- `POST /api/pedidos` - Crear pedido
- `GET /api/pedidos/{id}` - Obtener pedido
- `PUT /api/pedidos/{id}` - Actualizar pedido
- `DELETE /api/pedidos/{id}` - Eliminar pedido

## 📁 Módulos

### Auth
Gestión completa de autenticación:
- Registro de usuarios
- Login con JWT
- Recuperación de contraseña
- Validación de tokens

### Pedidos
Gestión de pedidos de productos:
- CRUD completo
- Validaciones de negocio
- Estados de pedido

## 🧪 Testing
```bash
mvn test
```

## 📝 Convenciones de Código

- **Domain**: Entidades puras, sin dependencias externas
- **Application**: Casos de uso, lógica de aplicación
- **Infrastructure**: Implementaciones técnicas (BD, HTTP, etc)

## 🤝 Contribuir

1. Fork el proyecto
2. Crea una rama (`git checkout -b feature/nueva-funcionalidad`)
3. Commit tus cambios (`git commit -am 'Agregar nueva funcionalidad'`)
4. Push a la rama (`git push origin feature/nueva-funcionalidad`)
5. Abre un Pull Request

## 👨‍💻 Autor

Harib de Jesus

## 📄 Licencia

Este proyecto está bajo la Licencia MIT - ver el archivo LICENSE para más detalles.