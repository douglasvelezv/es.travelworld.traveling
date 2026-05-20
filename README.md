# Traveling ✈️

Una aplicación Android sencilla desarrollada en **Kotlin** como parte de una práctica de iniciación. La idea es simple: el usuario escribe un mensaje, pulsa un botón y el texto aparece centrado en pantalla. Además, el botón y el texto reaccionan visualmente al ser presionados, cambiando de color momentáneamente.

![Android](https://img.shields.io/badge/Android-11.0+-green.svg)
![Kotlin](https://img.shields.io/badge/Kotlin-1.5+-purple.svg)
![MinSDK](https://img.shields.io/badge/MinSDK-API%2030%20(Android%2011.0)-blue.svg)

---

## 📱 ¿Qué hace la app?

- Tiene un **campo de texto** (`EditText`) donde puedes escribir lo que quieras.
- Un **botón "Enviar"** que:
  - Al hacer clic → muestra tu mensaje en el centro de la pantalla.
  - Al mantenerlo presionado → el botón y el texto del centro cambian a un color azul verdoso (`#0D7B8A`).
  - Al soltar → todo vuelve a su apariencia original.
- La pantalla está dividida en dos zonas:
  - **Parte superior (20%):** campo de texto y botón.
  - **Parte inferior (80%):** área gris clara donde aparece el mensaje centrado.
- Compatible con el **83% de los dispositivos Android** disponibles .

---

## 📸 Capturas de pantalla

| Pantalla inicial | Mensaje enviado | Efecto al presionar |
|:----------------:|:---------------:|:-------------------:|
| <img width="352" height="772" alt="image" src="https://i.ibb.co/yB01Q5ZS/1era-Parte.png" /> | <img width="352" height="772" alt="image" src="https://i.ibb.co/zWzwHdnr/2nd-Parte.png" /> | <img width="352" height="772" alt="image" src="https://i.ibb.co/Ld4Pkb5f/3era-Parte.png" /> |

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

## ⚙️ ¿Cómo ejecutarlo?

Sigue estos pasos para probar la aplicación en tu equipo:

```bash
# 1. Clona el repositorio
git clone https://github.com/douglasvelezv/es.travelworld.traveling.git

# 2. Abre Android Studio y selecciona "Open an Existing Project"
#    (elige la carpeta donde clonaste el repositorio)

# 3. Espera a que Gradle termine de sincronizar las dependencias

# 4. Conecta un dispositivo físico (con depuración USB activada)
#    o inicia un emulador con API 30 o superior

# 5. Pulsa el botón verde "Run" (►) y listo
```

---

## 📂 Estructura del proyecto

```
es.travelworld.traveling/
├── MainActivity.kt               # Controlador: lógica de clic y toque
└── res/
    ├── layout/
    │   └── activity_main.xml     # Vista: interfaz de usuario
    └── values/
        ├── strings.xml           # Textos (nombre app, etiquetas)
        └── themes.xml            # Tema personalizado (Theme.Traveling)
```

---

## Este repositorio ha sido creado siguiendo las instrucciones de la práctica:

✅ Desarrollado con Android Studio.

✅ Entregado mediante GitHub (enlace del proyecto).

🔗 https://github.com/douglasvelezv/es.travelworld.traveling

---

## 📄 Licencia

Este proyecto es solo para fines educativos. Puedes usarlo libremente como base para tus propios aprendizajes.
