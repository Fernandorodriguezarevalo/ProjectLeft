#Desarrollar un programa que le pida al usuario su nombre, edad y precio de su carro
#Calcular precio de tenencia

Tenencia = 0.13

Nom = input("Ingrese su nombre: ")
Nom = str(Nom)

edad = input("Ingrese su edad: ")
edad = int(edad)
preciocarro = input("Ingrese precio del carro: ")
preciocarro = float(preciocarro)

result = preciocarro * Tenencia

print("La cantidad a agar de tenencia es: ", result)
print("Nombre: ", Nom)
print("Edad: ", edad)
print("El precio de el carro es: ", preciocarro)
