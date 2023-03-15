lados = input("Imgrese el numero de lados")
lados = int(lados)


if(lados == 3):
    print("Es un triángulo")  
elif(lados == 4):
    print("Es un cuadrado")
elif(lados == 7):
    print("Es un heptágono")
elif(lados == 6):
    print("Es un Hexágono")
elif(lados == 8):
    print("Es un Octágono")
elif(lados == 10):
    print("Es un decágono")
elif(lados == 12):
    print("Es un dodecágono")        
elif(lados > 12):
    print("El número de lados no coinciden con una figura geométrica")
    
