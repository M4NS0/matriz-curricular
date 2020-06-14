echo
echo
sudo useradd -m -d /home/manso -s /bin/bash manso
echo
ls /home
echo
sudo passwd manso
echo

sudo -u manso mkdir /home/manso/gerenciamento
sudo -u manso mkdir /home/manso/gerenciamento/bruno
sudo -u manso mkdir /home/manso/gerenciamento/bruno/labcomp
sudo -u manso mkdir /home/manso/gerenciamento/bruno/redes
sudo -u manso mkdir /home/manso/gerenciamento/copia
sudo -u manso mkdir /home/manso/arquivos


sudo -u manso touch /home/manso/gerenciamento/gerenciamento.txt

echo "digite o password do novo usuario para inserir linhas no arquivo gerenciamento.txt"
echo
su -c "echo -e "-------------------------------------------" > /home/manso/gerenciamento/gerenciamento.txt" manso
echo "mais uma vez."
su -c "echo -e "Faculdade" "de" "Tecnologia" "Senac" "Goiás" >> /home/manso/gerenciamento/gerenciamento.txt" manso
echo "mais uma vez.."
su -c "echo -e "Feira" "de" "negocios" >> /home/manso/gerenciamento/gerenciamento.txt" manso
echo "mais uma vez..."
su -c "echo -e "-------------------------------------------" >> /home/manso/gerenciamento/gerenciamento.txt" manso
echo '						'[O.K]
cat /home/manso/gerenciamento/gerenciamento.txt
echo
sudo -u manso chmod 750 /home/manso/gerenciamento/gerenciamento.txt
echo
sudo -u manso cp /home/manso/gerenciamento/gerenciamento.txt /home/manso/gerenciamento/copia/usuariobrunomanso.txt
echo
sudo -u manso chmod +rwx+rx+rwx /home/manso/gerenciamento/copia/usuariobrunomanso.txt
echo
sudo -u manso cp /home/manso/gerenciamento/copia/usuariobrunomanso.txt /home/manso/gerenciamento/bruno/redes/feira.txt
echo
sudo -u manso chmod +rwx+rx+rwx /home/manso/gerenciamento/bruno/redes/feira.txt
echo
cat /home/manso/gerenciamento/bruno/redes/feira.txt
echo
sudo -u manso mv /home/manso/arquivos /home/manso/teste
echo
sudo -u manso rm -rf /home/manso/gerenciamento/bruno/labcomp
echo
sudo useradd teste
echo
sudo passwd teste
echo
id teste
echo
sudo cat /home/manso/gerenciamento/gerenciamento.txt
echo
sudo addgroup testegrupo
echo
sudo adduser manso testegrupo
echo
sudo deluser manso
echo
sudo deluser teste
echo
sudo groupdel testegrupo
echo
sudo rm -rf /home/manso
ls /home
echo
users
echo
w
echo
whoami









