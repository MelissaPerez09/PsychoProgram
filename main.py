from tkinter import *
from tkinter import ttk as ttk
from tkinter import messagebox as MessageBox
from usuario import usuario
import os
from tkinter import Tk, Label, Button, Radiobutton, IntVar
from PIL import ImageTk,Image
ventana_principal=Tk()

nombreUsuario = StringVar()
contraUsuario = StringVar()
usuarios = []

def crearInterfaz():

    ventana_principal.title("Login Usuario")


    ventana_principal.configure(bg="black")
    ventana_principal.geometry("700x800")
    imagen=ImageTk.PhotoImage(Image.open("mente.jpg").resize((400,500))) #Importación de imagénes para su posterior utilización 
    label=Label(image=imagen,bg="black")
    imagen2=ImageTk.PhotoImage(Image.open("bienvenida.png"))                                                                                        
    label2=Label(image=imagen2,bg="black")
    label2.place(x=0,y=50)
    label.place(x=345,y=230)
 
    etiqueta_nombre = Label(ventana_principal, text="Nombre de usuario  ",fg="purple1",bg="black",font=("Bahnschrift SemiLight",15))
    etiqueta_nombre.place(x=100,y=300) #ubica la etiqueta en coordenas específicas
    entrada_login_usuario=Entry(ventana_principal, font="Aharoni 10",width=20,textvariable=nombreUsuario)
    entrada_login_usuario.place(x=100,y=335)
    etiqueta_nombre2 = Label(ventana_principal, text="Contraseña  ",fg="purple1",bg="black",font=("Bahnschrift SemiLight",15))#Creación de la interfaz propiamente 
    etiqueta_nombre2.place(x=100,y=420)
    entrada_login_clave=Entry(ventana_principal, font="Aharoni 10",width=20,show="*")
    entrada_login_clave.place(x=100,y=455)
    nombreUsuario.set("")
    contraUsuario.set("")
 
    # botones
    iniciarSesionButton = ttk.Button(ventana_principal,text="Iniciar Sesion",command=iniciarSesion)

    iniciarSesionButton.place(x=100,y=540)
    cerrarSesionButton = ttk.Button(ventana_principal,text="Cerrar Sesion",command=cerrarSesion)

    registrarButton = ttk.Button(ventana_principal,text="Registrar",command=registrarUsuario)

    registrarButton.place(x=250,y=540)
    ventana_principal.mainloop()#Muestra la ventana con todo lo anterior implementado

def iniciarSesion():
    for user in usuarios:
        if user.nombre == nombreUsuario.get():
            test = user.conectar(contraUsuario.get())
            if test:
                #MessageBox.showinfo("Conectado")
                MessageBox.showinfo('information', 'Conectado')
            else:
                MessageBox.showerror("Error","Contraseña incorrecta")
            break
    else:
        MessageBox.showerror("Error","Ha introducido un usuario que no existe")

def cerrarSesion():
    pass

def registrarUsuario():
    nombre = nombreUsuario.get()
    contrase = contraUsuario.get()
    nuevoUsuario = usuario(nombre,contrase)
    usuarios.append(nuevoUsuario)
    MessageBox.showinfo('information', 'Ha hecho un registro con éxito')

    nombreUsuario.set("")
    contraUsuario.set("")

if __name__=="__main__":
  
    user1 = usuario("prueba","12345") #INICIALIZACIÓN
    usuarios.append(user1)
    crearInterfaz()
