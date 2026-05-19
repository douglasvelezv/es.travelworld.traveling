# Traveling ✈️

Aplicación Android nativa desarrollada en **Kotlin** como parte de una práctica de iniciación. Permite al usuario escribir un mensaje y visualizarlo en el centro de la pantalla, con una animación de color en el botón y el texto al presionar.

![Android](https://img.shields.io/badge/Android-11.0+-green.svg)
![Kotlin](https://img.shields.io/badge/Kotlin-1.5+-purple.svg)
![MinSDK](https://img.shields.io/badge/MinSDK-API%2030%20(Android%2011.0)-blue.svg)

---

## 📱 Características

- **Campo de texto interactivo** (`EditText`) para escribir cualquier mensaje.
- **Botón "Enviar"** que:
  - Al hacer clic → muestra el mensaje en el centro de la pantalla.
  - Al presionar (sin soltar) → cambia su color de fondo a `#0D7B8A` y el texto central al mismo tono.
  - Al soltar → vuelve a los colores originales.
- **Diseño limpio y adaptable**:
  - Parte superior (20%): entrada de texto + botón.
  - Parte inferior (80%): mensaje centrado sobre fondo gris claro.
- **Soporte del 83% de dispositivos Android** (según datos de septiembre 2021).

---

## 📸 Capturas de pantalla

| Pantalla inicial | Mensaje cambiado | Efecto al presionar |
|:----------------:|:----------------:|:-------------------:|
| (Añade aquí tu captura) | (Añade aquí tu captura) | (Añade aquí tu captura) |

> 💡 *Puedes generar capturas desde el emulador de Android Studio o desde tu dispositivo.*

---

## 🛠️ Tecnologías y requisitos

| Concepto | Detalle |
|----------|---------|
| **Lenguaje** | Kotlin |
| **IDE** | Android Studio (Ladybug \| 2024.2.1 o superior) |
| **SDK mínimo** | API 30 (Android 11.0) |
| **SDK destino** | API 34 (Android 14) – compilación |
| **Cobertura de dispositivos** | ~83% (según la ventana de creación del proyecto) |
| **Patrón de arquitectura** | MVC (Modelo-Vista-Controlador) simple |

---

## ⚙️ Guía de instalación y ejecución

Sigue estos pasos para probar la aplicación en tu equipo:

```bash
# 1. Clona el repositorio
git clone https://github.com/douglasvelezv/es.travelworld.traveling.git

# 2. Abre Android Studio y selecciona "Open an Existing Project"
#    (elige la carpeta donde clonaste el repositorio)

# 3. Espera a que Gradle sincronice las dependencias

# 4. Conecta un dispositivo físico (con depuración USB activada)
#    o inicia un emulador (API 30 o superior)

# 5. Haz clic en el botón verde "Run" (►)

```

## 📂 Estructura del proyecto

es.travelworld.traveling/

es.travelworld.traveling/
├── MainActivity.kt               # Controlador: lógica de clic y toque
├── res/
│   ├── layout/
│   │   └── activity_main.xml     # Vista: interfaz de usuario
│   ├── values/
│   │   ├── strings.xml           # Textos (nombre app, etiquetas)
│   │   └── themes.xml            # Tema personalizado (Theme.Traveling)
│   └── ...
└── ...

## Este repositorio ha sido creado siguiendo las instrucciones de la práctica:

✅ Desarrollado con Android Studio.

✅ Entregado mediante GitHub (enlace del proyecto).

https://github.com/douglasvelezv/es.travelworld.traveling


## 📄 Licencia

Este proyecto es solo para fines educativos. Puedes usarlo libremente como base para tus propios aprendizajes.
