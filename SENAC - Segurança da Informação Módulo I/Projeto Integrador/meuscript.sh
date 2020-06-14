//#!/bin/bash
x="Fim"
menu ()
{
while true $x != "Fim"
do
clear
echo "================================================"
echo "Menu GeoIPLookup"
echo ""
echo "1)Instalar GeoIPLookup / Ubuntu"
echo""
echo "2)Intalar GeoIPLookup / CentOS"
echo ""
echo "3)Encontrar o IP da Máquina"
echo ""
echo "4)Executar GeoIPLookup"
echo""
echo "5)Abrir Google Maps e Mostrar Localização"
echo""
echo "6)Sair do Programa e Imprimir Relatório "
echo "================================================"

echo "Digite a opção desejada:"
read x
echo "Opção informada ($x)"
echo "================================================"

case "$x" in

    1)
      echo "Instalando GeoIPLooKup no Ubuntu"
      apt install geoip-bin
      apt-get update
      sleep 2

echo "================================================"
;;
    2)
      echo "Instalando GeoIP e GeoIP-Data no CentOS"
      yum install -y GeoIP
      yum install -y GeoIP-data
      sleep 2
echo "================================================"
;;
   3)
      echo "Encontrando o IP da Máquina"
      MEUIP=`host myip.opendns.com resolver1.opendns.com | grep "myip.opendns.com has" | awk '{print $4}'`
      IP=`echo $MEUIP | cut -d '{' -f1`
      echo $IP
      sleep 10
echo "================================================"
;;

    4)
       echo "Executando GeoIPLookup"
       MEUIP=`host myip.opendns.com resolver1.opendns.com | grep "myip.opendns.com has" | awk '{print $4}'`
       IP=`echo $MEUIP | cut -d '{' -f1`
       geoiplookup $IP
       sleep 10
echo "================================================"
;;

    5)
       echo "Abrir Google Maps e Mostrar Localização"
       PAIS=`geoiplookup $IP | grep Country | cut -d , -f2`
       CITY=`geoiplookup $IP | grep City | cut -d : -f2`
       LAT=`echo $CITY | cut -d , -f6`
       LON=`echo $CITY | cut -d , -f7`
       CIDADE=`echo $CITY | cut -d , -f 3`
       ASN=`geoiplookup $IP | grep ASNum | cut -d : -f2`
       LATLON=$(echo "$LAT,$LON" |tr -d '[:space:]')
       sudo /usr/bin/firefox --new-window "https://www.google.com/search?q=$LATLON"
       sleep 10
echo "================================================"
;;
     6)
       echo "Mostrando Relatório..."
       echo -e "\n"
       PAIS=`geoiplookup $IP | grep Country | cut -d , -f2`
       CITY=`geoiplookup $IP | grep City | cut -d : -f2`
       LAT=`echo $CITY | cut -d , -f6`
       LON=`echo $CITY | cut -d , -f7`
       CIDADE=`echo $CITY | cut -d , -f 3`
       ASN=`geoiplookup $IP | grep ASNum | cut -d : -f2`
       echo -e " O IP Pesquisado esta no país: $PAIS. \n Cidade: $CIDADE. \n Latitude: $LAT. \n Longitude: $LON. \n Número ASN: $ASN"
       echo -e "\n"
echo "================================================"
       echo "saindo..."
       exit;
echo "================================================"
;;
*)


        echo "Opção inválida!"
esac
done

}
menu





 # echo "Instalando GeoIPLooKup no CentOS"
  #    read nome
   #   apt-get remove --purge $nome
    #  sleep 5
