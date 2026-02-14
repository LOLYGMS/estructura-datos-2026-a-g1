# Taller 1 - Estructura de datos

## Aplicación elegida: Google Maps

### Tres tipos de datos que maneja:

* Ubicaciones (Lugares): Restaurantes, gasolineras, monumentos, direcciones específicas.

* Rutas y direcciones: El camino calculado entre un punto A y un punto B, incluyendo giros, semáforos y tramos.

* Reseñas y puntuaciones: Comentarios escritos por usuarios y las estrellas de calificación de los lugares.

---

##Organización propuesta:

**Ubicaciones:** En una tabla hash para búsquedas rápidas por nombre o coordenadas.

**Rutas:** Como una cola de pasos a seguir, y para calcularlas se usa un grafo con calles y cruces.

**Reseñas:** En una lista ordenada por fecha o puntuación, asociadas a cada lugar mediante una tabla hash.

