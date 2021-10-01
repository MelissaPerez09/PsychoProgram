from tkinter import * # IMPORTACIÓN DE TODAS LAS LIBRERIAS CORRESPONDIENTES
from tkinter import ttk as ttk
from tkinter import messagebox as MessageBox
from usuario import usuario
import os

from tkinter import Tk, Label, Button, Radiobutton, IntVar
from PIL import ImageTk,Image
from Preguntas import Preguntas

#from ultima import ultima
ventana_principal=Tk()# CREACIÓN DE VENTANA PRINCIPAL TIPO TK

nombreUsuario = StringVar()#DECLARACIÓN DE VARIABLES
contraUsuario = StringVar()#DECLARACIÓN DE VARIABLES
usuarios = []

def crearInterfaz(): #Función que crea interfaz

    ventana_principal.title("Login Usuario") #asignación de títulos y demás caracterísitcas
    ventana_principal.configure(bg="black")#asigna color 
    ventana_principal.geometry("700x800") #dimensiona la ventana 
    imagen=ImageTk.PhotoImage(Image.open("mente.jpg").resize((400,500))) #Importación de imagénes para su posterior utilización 
    label=Label(image=imagen,bg="black")#Se asigna un color de fondo para la imagén, fin de realizar un buen constraste
    imagen2=ImageTk.PhotoImage(Image.open("bienvenida.png"))#BIEVENIDA                                                                                 
    label2=Label(image=imagen2,bg="black")#imagén y asignación de color de fondo
    label2.place(x=0,y=50) # ubicación respectiva de la etiqueta
    label.place(x=345,y=230)#ubicación respectiva de la etiqueta
 
    etiqueta_nombre = Label(ventana_principal, text="Nombre de usuario  ",fg="purple1",bg="black",font=("Bahnschrift SemiLight",15))# asignación de características a la label
    etiqueta_nombre.place(x=100,y=300) #ubica la etiqueta en coordenas específicas
    entrada_login_usuario=Entry(ventana_principal, font="Aharoni 10",width=20,textvariable=nombreUsuario) #asignación de variable tipo texto, características
    entrada_login_usuario.place(x=100,y=335)#coordenando  la entrada del login
    etiqueta_nombre2 = Label(ventana_principal, text="Contraseña  ",fg="purple1",bg="black",font=("Bahnschrift SemiLight",15))
    etiqueta_nombre2.place(x=100,y=420)#coordenando la etiqueta
    entrada_login_clave=Entry(ventana_principal, font="Aharoni 10",width=20,show="*") # fin de protección de la contraseña del usuario
    entrada_login_clave.place(x=100,y=455) # coordenando la entrada de la clave login
    nombreUsuario.set("")
    contraUsuario.set("")
 
    # botones
    iniciarSesionButton = ttk.Button(ventana_principal,text="Iniciar Sesion",command=iniciarSesion)
#botones ttk son más amigables, command respectivo para asignar una función
    iniciarSesionButton.place(x=100,y=540)
    cerrarSesionButton = ttk.Button(ventana_principal,text="Cerrar Sesion",command=cerrarSesion)

    registrarButton = ttk.Button(ventana_principal,text="Registrar",command=registrarUsuario)

    registrarButton.place(x=250,y=540)
    
    registrarButton = ttk.Button(ventana_principal,text="Registrar",command=registrarUsuario)

    registrarButton.place(x=250,y=540) #coordenando el botón de registro
    ventana_principal.mainloop()#Muestra la ventana con todo lo anterior implementado

def iniciarSesion(): #función
    for user in usuarios: # se recorre la lista
        if user.nombre == nombreUsuario.get():
            test = user.conectar(contraUsuario.get()) # es la condición correcta,se conecta
            if test:
                #MessageBox.showinfo("Conectado")
                MessageBox.showinfo('information', 'Conectado')
            else:
                MessageBox.showerror("Error","Contraseña incorrecta") # condición incorrecta, no locra establecer conexión
            break
    else:
        MessageBox.showerror("Error","Ha introducido un usuario que no existe") # caso contrario

def cerrarSesion():
    pass #aún no se ha definido el código 

def registrarUsuario(): #función en caso de un registro exitoso
    nombre = nombreUsuario.get()
    contrase = contraUsuario.get()
    nuevoUsuario = usuario(nombre,contrase) # envia los parametros respectivos para la clase usuario
    usuarios.append(nuevoUsuario) # agrega a la lista
    MessageBox.showinfo('information', 'Ha hecho un registro con éxito')
    pregunta1 = input("\n(1) Que situaciones tienes en tu vida actualmente? ")
    pregunta2 = input("\n(2) Como te has sentido con esas situaciones? ") # asignación de los valores que se necesitan como parametros
    pregunta3 = input("\n(3) Que trae de positivo estas situaciones? ")
    pregunta4 = input("\n(4) Que trae de negativo estas situaciones? ")
    pregunta5 = input("\n(5) Que mejorarias o aprovecharias esta situacion? ")
    print("\n\n* Recuerda, siempre hay un aprendizaje en cada paso de la vida :) *") # se le pasan los parametros al objeto
    e=Preguntas(pregunta1,pregunta2,pregunta3,pregunta4,pregunta5)
    e.imprimirPreguntas() # se llama a la función del objeto propiamente 

    from nueva import nueva #importa de último, fin de estrategia
    nombreUsuario.set("")
    contraUsuario.set("") 

if __name__=="__main__": #pregunta : la clase es la principal?
   
    crearInterfaz() # crea la interfaz 
    
