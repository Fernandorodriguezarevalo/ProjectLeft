nombre = input ("Inresa tu nombre: ")

apellido = input ("Ingresa tu apellido: ")


edad = input ("Ingresa tu edad: ")
edad = int (edad)

if(edad >= 18):
    ingresosmensuales = input ("Ingres la cantidad de ingresos mensuales que tiene: ")
    ingresosmensuales = float (ingresosmensuales)
    if(ingresosmensuales >= 10000 and ingresosmensuales <= 25000):
        print("hola")
        print("Usted es candidato para nuestra segmentación clásica")
        print("adios")
    elif(ingresosmensuales > 25000 and ingresosmensuales <= 35000):
        print("Usted es candidato a nuestra segción de oro")
        print("Adios")
    elif(ingresosmensuales > 35000):
        print("Usted es candidato es nuestra segmentación platino")
        print("Adios")
    else:
        print("Usted no es candidato para solicitar un prestamo con nosotros")
        print("Adios")
else:
    print("No puede solicitar su prestamo bancario debe ser mayor de edad")
    print("Adios")


