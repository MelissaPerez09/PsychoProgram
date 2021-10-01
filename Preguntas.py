# Clase designada para tener la segunda interaccion con el usuario por medio de preguntas
# Creado por: Emily ELvia Melissa Perez Alarcon - 21385
# Proyecto POO
# Fecha de creacion: 29/08/21
# Fecha de finalizacion: 30/09/21

class Preguntas:

    #se crean los atributos correspondientes de la clase
    def __init__ (self, pregunta1, pregunta2, pregunta3, pregunta4, pregunta5):
        self.pregunta1 = pregunta1
        self.pregunta2 = pregunta2
        self.pregunta3 = pregunta3
        self.pregunta4 = pregunta4
        self.pregunta5 = pregunta5
    
    #se genera el constructor para obtener la informacion de las preguntas
    def getPregunta1(self):
        return self.pregunta1
    def getPregunta2(self):
        return self.pregunta2
    def getPregunta3(self):
        return self.pregunta3
    def getPregunta4(self):
        return self.pregunta4
    def getPregunta5(self):
        return self.pregunta5

    #crea funcion para imprimir las preguntas
    def imprimirPreguntas(self):
        print("\nPregunta1: " + self.getPregunta1() + "\nPregunta2: " + self.getPregunta2() + "\nPregunta3: " + 
        self.getPregunta3() + "\nPregunta4: " + self.getPregunta4() + "\nPregunta5: " + self.getPregunta5() + "\n")

#se establecen los inputs para ingresar la informacion
    #def preguntas(self):
       # pregunta1 = input("\n(1) Que situaciones tienes en tu vida actualmente? ")
       # pregunta2 = input("\n(2) Como te has sentido con esas situaciones? ")
        #pregunta3 = input("\n(3) Que trae de positivo estas situaciones? ")
        #pregunta4 = input("\n(4) Que trae de negativo estas situaciones? ")
       # pregunta5 = input("\n(5) Que mejorarias o aprovecharias esta situacion? ")
        #print("\n\n* Recuerda, siempre hay un aprendizaje en cada paso de la vida :) *")
    #e = Preguntas(pregunta1,pregunta2,pregunta3,pregunta4,pregunta5)
#genera el constructor con toda la informacion proveida
   # preguntas()
  
#imprime el constructor mediante la funcion creada
   # imprimirPreguntas()
    #preguntas()
