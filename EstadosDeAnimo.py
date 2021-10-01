import os
import csv
import pathlib

def registrar_animo(nombre_archivo):
    resumen = int(input("¿Cúantos estados de ánimo tuviste el día de hoy?"))
    campos = ["Fecha", "EstadoAnimo", "¿Por qué?"]
    
    if not pathlib.Path(nombre_archivo).exists():
        with open(nombre_archivo, "w", newline="") as archivo_csv:
            writer = csv.DictWriter(archivo_csv, dieldnames=campos)
            writer.writeheader()
    
    
    with open(nombre_archivo, "a", newline="") as archivo_csv:
        writer = csv.writer(archivo_csv, delimiter=",")
        for i in range(resumen):
            os.system("cls")
            fecha = input("Fecha: ")
            animo = input("Ánimo: ")
            razon = input("¿Por qué?: ")
#             writer.writerow({"Ánimo": animo, "¿Por qué?": razon, "Fecha": fecha})
            writer.writerow([fecha, animo, razon])
            
def recuperar_datos(nombre_archivo):
    os.system("cls")
    print("Estados de Animo regsitrados: ")
    with open(nombre_archivo, "r", newline="") as archivo_csv:
        reader= csv.DictReader(archivo_csv)
        for linea in reader:
             for campo, valor in linea.items():
                 print(f"{campo}: {valor}")
             print("-"*50)

def main():
    archivo = "EstadosDeAnimo.csv"
    registrar_animo(archivo)
    recuperar_datos(archivo)
    
if __name__ == "__main__":
    main()

