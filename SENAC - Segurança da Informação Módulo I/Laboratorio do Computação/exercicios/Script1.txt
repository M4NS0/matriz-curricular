clear
echo para limpar o terminal usa-se o comando clear
echo
echo o caminho atual na estrutura de diretorio usando comando ls
ls
echo criando diretorio /home/aluno/laboratorio/Senac com o comando mkdir
mkdir /home/aluno/laboratorio/Senac
sleep 3
echo criando diretorio /home/aluno/laboratorio/Senac com o comando mkdir
mkdir /home/aluno/laboratorio/Arquivos
sleep 3
echo criando diretorio /home/aluno/laboratorio/Senac/Bruno com mkdir
mkdir /home/aluno/laboratorio/Senac/Bruno
sleep 3
echo criando diretorio /home/aluno/laboratorio/Senac/Backup
mkdir /home/aluno/laboratorio/Senac/Backup 
sleep 3
echo criando diretorio /Lab Computação e /Algoritmos em /home/aluno/laboratorio/Senac/Aluno
mkdir /home/aluno/laboratorio/Senac/Bruno/Lab\Computação/
mkdir /home/aluno/laboratorio/Senac/Bruno/Algoritmos
sleep 3
echo criando uma arvore de diretorio apartir da pasta pessoal
cd /home/aluno
tree
sleep 3
echo criando arquivo de nome usuario.txt com o seguinte texto:
touch /home/aluno/laboratorio/Senac/usuario.txt
echo Faculdade de Tecnologia Senac Goiás
echo Segurança da informação
echo Bruno
echo "Faculdade de Tecnologia Senac Goiás" > /home/aluno/laboratorio/Senac/usuario.txt
echo "Segurança da informação" >> /home/aluno/laboratorio/Senac/usuario.txt
echo "Bruno Camargo Manso" >> /home/aluno/laboratorio/Senac/usuario.txt
sleep 3
echo
echo
echo mudando as permissoes de usuarios para 770 com o comando chmod
chmod 770 /home/aluno/laboratorio/Senac/usuario.txt
sleep 3
echo copiando o arquivo usuario.txt para pasta /Algoritmos e mudando o nome para texto.txt
cp /home/aluno/laboratorio/Senac/usuario.txt /home/aluno/laboratorio/Senac/Bruno/Algoritmos/texto.txt
sleep 3
echo mudando as permissoes do arquivo texto.txt para no modo simbolico usando chmod rwxr--r--
echo chmod rwxr--r-- /home/aluno/laboratorio/Senac/Bruno/Algoritmos/texto.txt
sleep 3
echo copiando arquivo usuario.txt para pasta /Arquivos e renomear para apresentação.txt
cp /home/aluno/laboratorio/Senac/usuario.txt /home/aluno/laboratorio/Arquivos/apresentação.txt
sleep 3
echo mudando as permissoes do arquivo apresentacao.txt com chmod 766
chmod 766 /home/aluno/laboratorio/Arquivos/apresentação.txt
sleep 3
echo descrevendo arquivo texto.txt com o cat
cat /home/aluno/laboratorio/Senac/Bruno/Algoritmos/texto.txt
sleep 3
echo mudando o nome do diretorio /Backup em /Copia
sudo mv /home/aluno/laboratorio/Senac/Backup /home/aluno/laboratorio/Senac/Copia
sleep 3
echo excluindo o diretorio /Algoritmos
rm -r /home/aluno/laboratorio/Senac/Bruno/Algoritmos
sleep 3
echo imprimindo arvore de diretorio apartir da pasta /Senac
cd /home/aluno/laboratorio/Senac
tree /home/aluno/laboratorio/Senac
echo apagando arquivos  recentemente criados nesse script
rm -r /home/aluno/laboratorio/Senac
rm -r /home/aluno/laboratorio/Arquivos
sleep 3
echo bye bye!
