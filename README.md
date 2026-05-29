# Control Remoto de TV en Java Swing

Este es un proyecto de aplicación de escritorio interactiva desarrollada en Java utilizando la librería gráfica Swing. La aplicación simula el comportamiento lógico y visual de un control remoto auténtico, cuidando la simetría de la interfaz y las reglas de funcionamiento de un televisor real.

Enlace del Repositorio: https://github.com/PipeIll/Control_Remoto.git

---

## Características Principales

* **Teclado Numérico Inteligente:** Permite digitar canales de hasta 3 dígitos. Si se introduce un cuarto dígito, la pantalla se limpia automáticamente para iniciar una nueva selección.
* **Sincronización de Canales (CH+ / CH-):** Botones secuenciales para subir y bajar canales, sincronizados con el número actual en pantalla y protegidos contra valores negativos.
* **Control de Volumen Dinámico:** Incremento y decremento visual del volumen reflejado en tiempo real a través de un JProgressBar.
* **Sistema de Silencio (Mute):** Botón tipo interruptor (Toggle) que almacena el volumen actual en memoria, lo reduce a cero y restablece el valor exacto al ser presionado nuevamente.
* **Botón de Encendido (Power LED):** Indicador LED dinámico que cambia de estado e identidad visual (Rojo Oscuro para apagado y Verde Bosque para encendido).
* **Diseño Visual Personalizado:** Interfaz oscura y simétrica construida mediante un Layout estructurado en IntelliJ, aplicando una paleta de colores hexadecimales específica para cada grupo de componentes.

---

## Tecnologías Utilizadas

* **Lenguaje:** Java
* **Framework Gráfico:** Java Swing y AWT
* **IDE de Desarrollo:** IntelliJ IDEA (Diseñador .form)
* **Gestor de Versiones:** Git y GitHub

---

## Estructura de Colores Aplicada (Hexadecimal)

Para lograr un acabado estético moderno y limpio, se configuraron los siguientes tonos:
* **Cuerpo del Control:** #1E2022 (Gris oscuro mate)
* **Teclado Numérico:** #2D3135 (Gris grafito) con texto #FFFFFF
* **Controles de CH y VOL:** #3A3F44 (Gris de acción)
* **Pad Direccional (OK y Flechas):** #101112 (Negro profundo)
* **Power LED:** Dinámico entre #78281F (Apagado) y #145A32 (Encendido)

---

## Cómo Ejecutar el Proyecto

1. Clonar el repositorio:
```bash
   git clone [https://github.com/PipeIll/Control_Remoto.git](https://github.com/PipeIll/Control_Remoto.git)