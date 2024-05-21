REALIZACIÓN DE LA ACTIVIDAD DE GESTIÓN DE LA BASE DE DATOS NBA (MARIO GONZÁLEZ VELA)

Dada la base de datos nba.sql deberemos realizar una aplicación en 
Java para trabajar con los datos de la misma.
1. Crearemos una clase para realizar la conexión con jdbc
◦ La clase debe ser singleton
◦ Deberemos crear una clase abstracta para tener las variables 
de uso declaradas
2. Cada una de las tablas de la base de datos tendrá su modelo 
(nombre de la tabla en singular) en nuestra aplicación para crear 
objetos de cada una de ellas.
3. Crearemos una clase (nombre del modelo como una 
implementación de la interfaz) que implementara cada una de 
las interfaces (nombre del modelo como objeto de acceso a 
datos) para cada uno de los modelos.
4. Las interfaces contaran al menos con los siguientes métodos:
EquipoDAO
▪ Equipo findById(String nombre);
▪ List<Equipo> findAll();
▪ int eliminarEquipo(String nombe);
▪ boolean crearEquipo(Equipo equipo);
▪ boolean cambioDivision(Equipo equipo); 
JugadorDAO
▪ Jugador findById(string nombre);
▪ List<Jugador> findAll();
▪ boolean crearJugador(Jugador jugador);
▪ boolean ficharJugador(Jugador jugador);
▪ boolean pruebasFisicasJugador(Jugador jugador);
▪ int retirarJugador(int codigo);
EstadisticaDAO
▪ List<Estadistica> findById(int codigo);
▪ List<Estadistica> findByCountry(String country);
▪ List<Estadistica> findByEquipo(String nombre);
▪ double mediaPuntosPartido(Jugador jugador);
▪ double mediaAsistencias(Jugador jugador);
▪ double mediaTapones(Jugador jugador);
▪ double mediaRebotes(Jugador jugador);
PartidoDAO
▪ void visualizarDatos(Partido partido);
▪ double mediaPuntos(Equipo equipo);
▪ double mediaAsistencias(Equipo equipo);
▪ double mediaTapones(Equipo equipo);
▪ double mediaRebotes(Equipo equipo);
▪ double mediaPuntosLocal(Partido partido);
▪ double mediaPuntosVisitante(Partido partido);
▪ double porcentajeVictorias(Partido partido);
5. Cada “grupo de clases” deberá estar organizado en un paquete
diferente.
6. Se deberá crear una clase Menu para gestionar la aplicación que 
nos lleve a unos submenús para probar los métodos
implementados.
7. La clase main solo deberá tener una llamada al método creado en 
la clase Menu.
8. Se realizarán test con Junit de todos y cada uno de los métodos.
9. El proyecto debe estar subido a github
