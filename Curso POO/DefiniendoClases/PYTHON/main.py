from DefiniendoClases.PYTHON.account import Account
from DefiniendoClases.PYTHON.car import Car

if __name__ == "__main__":
    print("Hello world")

    car = Car("QWE123", Account("Alejandro Jimenez","456123"))
    car.passenger = 4
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("QWE456", Account("Alejandra Jimenez","123456"))
    car2.passenger = 2
    print(vars(car2))
    print(vars(car2.driver))
