class Pila:
    def __init__(self):
        self.pila = []

    def apilar(self, dato):
        # print "Apilo : ", dato
        self.pila.append(dato)

    def desapilar(self):
        # print "Desapilo :"
        try:
            return self.pila.pop()
        except:
            print "Pila vacia"

    def esPilaVacia(self):
        # print "Esta vacia?"
        return self.pila == []
