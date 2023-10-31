# El "#languaje" No es un comentario representa el tipo de lenguaje utilizado en la estructura de Gherkin
#language: es

# @Todos            # Etiqueta para todos los escenarios
# @{Funcionalidad}  # Palabra clave representativa de la funcionalidad

@Todos
@Acceso
Característica: acceso a Demoblaze
  Yo como usuario
  Necesito autenticarme con mi cuenta en Demoblaze
  Para acceder a su contenido

  # @HP            # Tipo de prueba [Happy Path | Altern Path]
  # @Regresion     # Aplica para regresion
  # @Smoke         # Aplica para prueba de humo
  # @C######       # ID CP en la herramienta ALM de gestion de pruebas
  # @Actual        # Escenario que se esta automatizando/trabajando actualmente


  @HP
  @Regresion
  @CP-001 # Acceder con credenciales correctamente
  Esquema del escenario: Acceder con credenciales correctamente
    Dado que el "Usuario" se encuentra en la pagina Demoblaze
    Cuando intenta acceder con credenciales <usuario_acceso>, <clave_acceso>
    Entonces debería mostrarse en la web: "Welcome JhonC"
    Ejemplos:
      | usuario_acceso | clave_acceso |
      | JhonC          | 12345        |
