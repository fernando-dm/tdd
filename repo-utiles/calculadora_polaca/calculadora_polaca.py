#!/usr/bin/env python
#encoding: latin1
from clasePila import Pila
def calculadora_polaca(elementos):
 """ Dada una lista de elementos que representan las componentes de
 una expresion en notacion polaca inversa, evalua dicha expresion.
 Si la expresion esta mal formada, levanta ValueError. """

 p = Pila()
 for elemento in elementos:
     print "DEBUG:", elemento
 # Intenta convertirlo a numero
     try:
         numero = float(elemento)
         p.apilar(numero)
         print "DEBUG: apila ", numero
         # Si no se puede convertir a numero, deberia ser un operando
     except ValueError:
         # Si no es un operando valido, levanta ValueError
         if elemento not in "+-*/ %" or len(elemento) != 1:
             raise ValueError("Operando invalido")
         # Si es un operando valido, intenta desapilar y operar
         try:
             a1 = p.desapilar()
             print "DEBUG: desapila ",a1
             a2 = p.desapilar()
             print "DEBUG: desapila ",a2
         # Si hubo problemas al desapilar
         except ValueError:
             print "DEBUG: error pila faltan operandos"
             raise ValueError("Faltan operandos")

         if elemento == "+":
             resultado = a2 + a1
         elif elemento == "-":
             resultado = a2 - a1
         elif elemento == "*":
             resultado = a2 * a1
         elif elemento == "/":
             resultado = a2 / a1
         elif elemento == " %":
             resultado = a2 % a1
         print "DEBUG: apila ", resultado
         p.apilar(resultado)
 # Al final, el resultado debe ser lo unico en la Pila
 res = p.desapilar()
 if p.esPilaVacia():
    return res
 else:
    print "DEBUG: error pila sobran operandos"
    raise ValueError("Sobran operandos")

def main():
    expresion = raw_input("Ingrese la expresion a evaluar: ")
    elementos = expresion.split()
    print calculadora_polaca(elementos)
#import calculadora_polaca
#calculadora_polaca.main()
