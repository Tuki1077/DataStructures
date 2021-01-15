
def conseguir_nota(Nota):
    try:
        Nota = int(Nota)
    except ValueError:
        print ("Ingrese un valor valido :D")
        return False
    if (Nota > 0):
        if (Nota <= 39 ):
            return"D"
        elif (Nota >= 40 and Nota <=49 ):
            return "C"
        elif (Nota >= 50 and Nota <= 59):
            return "B"
        elif (Nota >= 60 and Nota <= 75):
            return "A"
        elif (Nota >= 75):
            return "0"
    else:
        print("Ingrese un valor positivo")
        return False