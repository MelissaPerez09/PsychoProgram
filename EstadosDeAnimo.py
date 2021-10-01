# Clase designada para preguntarle al usuario su estado de ánimo y registrarlo en un csv
# Creado por: Javier Alexander Vásquez Sazo - 21585
# Proyecto POO
# Fecha de creacion: 29/08/21
# Fecha de finalizacion: 30/09/21

#importar librerias
import os
import csv
import pathlib

# Método para registrar los animos de los usuarios
def registrar_animo(nombre_archivo):
    resumen = int(input("¿Cúantos estados de ánimo tuviste el día de hoy?"))
    campos = ["Fecha", "EstadoAnimo", "¿Por qué?"]
    
    #Se genera una condición para que se cree un documento csv automáticamente
    if not pathlib.Path(nombre_archivo).exists():
        with open(nombre_archivo, "w", newline="") as archivo_csv:
            writer = csv.DictWriter(archivo_csv, dieldnames=campos)
            writer.writeheader()
    
    #Se genera un contexto para registrar la información de los usuarios
    with open(nombre_archivo, "a", newline="") as archivo_csv:
        writer = csv.writer(archivo_csv, delimiter=",")
        for i in range(resumen):
            os.system("cls")
            fecha = input("Fecha: ")
            animo = input("Ánimo: ")
            razon = input("¿Por qué?: ")
#             writer.writerow({"Ánimo": animo, "¿Por qué?": razon, "Fecha": fecha})
            writer.writerow([fecha, animo, razon])

# Método para recuperar los datos e imprimirlos al cuando se acabe el programa
def recuperar_datos(nombre_archivo):
    os.system("cls")
    print("Estados de Animo regsitrados: ")
    with open(nombre_archivo, "r", newline="") as archivo_csv:
        reader= csv.DictReader(archivo_csv)
        for linea in reader:
             for campo, valor in linea.items():
                 print(f"{campo}: {valor}")
             print("-"*50)

# Definir método principal
def main():
    archivo = "EstadosDeAnimo.csv"
    registrar_animo(archivo)
    recuperar_datos(archivo)
    
if __name__ == "__main__":
    main()

