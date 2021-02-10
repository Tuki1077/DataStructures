from random import randint
import flask
from flask import request, jsonify

app = flask.Flask(__name__)
app.config["DEBUG"] = True

def linear_search_algorithm(valor,lista):
    for counter in range (len(lista)):
        if valor == lista [counter]:
            return counter
    return -1

def binary_search_algorithm(element, array, start, end):
    if start > end:
        return -1

    mid = (start+end) // 2

    if element == array[mid]:
        return mid
    
    if element < array[mid]:
        return binary_search_algorithm(element, array, start, mid-1)
    else: 
        return binary_search_algorithm(element, array, mid+1, end)

@app.route('/binary_search/<int:N>/<int:Value>', methods=['GET'])
def api_binary(N, Value):
    arr = []
    contador = 0
    while contador <= N:
        arr.append(randint(0,50))
        contador = contador + 1
    arr.sort()
    Search = binary_search_algorithm(Value, arr, 0, len(arr)) 

    if Search == -1:
        print ("El numero no esta")
        return "False"
    else:
        print (f"El numero esta en la posicion {Search}")
        return "True"

@app.route('/linear_search/<int:N>/<int:Value>', methods=['GET'])
def api_linear(N, Value): 
    arr = []
    contador = 0
    while contador <= N:
        arr.append(randint(0,50))
        contador = contador + 1
    arr.sort()
    Search = linear_search_algorithm(Value, arr) 

    if Search == -1:
        print ("El numero no esta")
        return "False"
    else:
        print (f"El numero esta en la posicion {Search}")
        return "True"


app.run()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
