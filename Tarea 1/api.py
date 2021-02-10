import random
import flask
from flask import request, jsonify

app = flask.Flask(__name__)
app.config["DEBUG"] = True

def crear_lista(cantidad, modo="unordered"):
    arr = []
    for i in range(cantidad):
        r = random.randint(0, cantidad)
        arr.append(r)
    if (modo == "ordered"):
        arr.sort()
    return arr

def binary_search(valor, cantidad):
    lista = crear_lista(cantidad, "ordered")
    return binary_search_algorithm(valor, lista, 0, len(lista))

def linear_search (valor, cantidad):
    lista = crear_lista(cantidad)
    return linear_search_algorithm(valor,lista)

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

@app.route('/', methods=['GET'])
def home():
    return '''<h1>Distant Reading Archive</h1>
<p>A prototype API for distant reading of science fiction novels.</p>'''

@app.route('/binary_search', methods=['GET'])
def api_binary(): 
  N = int(request.args.get('N'))
  value = int(request.args.get('Value'))

  return str(binary_search(value,N))

@app.route('/linear_search', methods=['GET'])
def api_linear(): 
  N = int(request.args.get('N'))
  value = int(request.args.get('Value'))

  return str(linear_search(value,N))


app.run()                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
