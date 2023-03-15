radio = input ("Ingresa el radio del circulo: ")
radio = int (radio)

if(radio <= 0):
    print("Error, adiós")
elif(radio > 0):
    radio = radio * radio
    area = 3.1416 * radio
    print("El area del cierculo es: ", area)
    print("Adios")



