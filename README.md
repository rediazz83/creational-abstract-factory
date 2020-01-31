# creational-abstract-factory
Ejemplo usando el patron Abstract Factory

# Abstract Factory

> Tiene como objetivo la creación de objetos reagrupados en familias sin tener que conocer las clases concretas destinadas a la creación de estos objetos.

### Dominios de uso
El patrón se utiliza en los dominios siguientes:

  - Un sistema que utiliza productos necesita ser independiente de la forma en que se crean y agrupan estos productos.

  - Un sistema está configurado según varias familias de productos que pueden evolucionar.

### Caso de estudio

El sistema de venta de vehículos gestiona vehículos que funcionan con gasolina y vehículos eléctricos. Esta gestión está delegada en el objeto Catálogo encargado de crear tales objetos.

Para cada producto, disponemos de una clase abstracta, de una subclase concreta derivando una versión del producto que funciona con gasolina y de una subclase concreta derivando una versión del producto que funciona con electricidad.

El metodo main puede utilizar estas subclases concretas para instanciar los productos. No obstante si fuera necesario incluir nuevas clases de familias de vehículos (diésel o mixto gasolina-eléctrico), las modificaciones a realizar pueden ser bastante pesadas.

El patrón Abstract Factory resuelve este problema introduciendo una interfaz FábricaVehículo que contiene la firma de los métodos para definir cada producto. El tipo devuelto por estos métodos está constituido por una de las clases abstractas del producto. De este modo el metodo main no necesita conocer las subclases concretas y permanece desacoplado de las familias de producto.

Se incluye una subclase de implementación de FábricaVehículo por cada familia de producto, a saber las subclases FábricaVehículoElectricidad y FábricaVehículoGasolina. Dicha subclase implementa las operaciones de creación del vehículo apropiado para la familia a la que está asociada.

El metodo main recibe como parámetro una instancia que responde a la interfaz FábricaVehículo, es decir o bien una instancia de FábricaVehículoElectricidad, o bien una instancia de FábricaVehículoGasolina. Con dicha instancia, se puede crear y manipular los vehículos sin tener que conocer las familias de vehículos y las clases concretas de instanciación correspondientes.
