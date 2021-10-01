

class usuario():
    
    numUsuarios = 0

    def __init__(self,nombre,contra):
        self.nombre = nombre
        self.contra = contra

        self.conectado = False
        self.intentos = 5

        usuario.numUsuarios+=1
    
    def conectar(self,contrasenia=None):
        if contrasenia==None:
            myContra = input("Ingrese su contraseña: ")
        else:
            myContra=contrasenia
        if myContra==self.contra:
      
            self.conectado = True
            return True
        else:
            self.intentos-=1
            if self.intentos > 0:
            
                if contrasenia!=None:
                    return False
             
                self.conectar()
            
              
    

