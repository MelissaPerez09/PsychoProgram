

class usuario():


class usuario():  # creación de la clase
    
    numUsuarios = 0

    def __init__(self,nombre,contra):# self, tratamos un objet
        self.nombre = nombre #asignación del nombre, es como this en java
        self.contra = contra

        self.conectado = False
        self.intentos = 5 # se le brindan al usuario n intentos

        usuario.numUsuarios+=1 # se suma un número de usuario
    
    def conectar(self,contrasenia=None): # Si el usuario no llegará a ingresar una contraseña
        if contrasenia==None:
            myContra = input("Ingrese su contraseña: ")
        else:
            myContra=contrasenia 
        if myContra==self.contra:
      
            self.conectado = True # valida que la condición sea verdadwera 
            return True # retorna un booleano
        else:
            self.intentos-=1 # le quita un intetno
            if self.intentos > 0:
            
                if contrasenia!=None:
                    return False # retorna booleano
             
                self.conectar() # función
            
              
    

