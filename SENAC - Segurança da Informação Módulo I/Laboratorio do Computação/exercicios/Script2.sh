clear
echo
echo
echo
echo
echo '				'Listando arquivos do diretorio /home/$USER usando ls:
echo
ls /home/$USER
sleep 3
echo 
echo
echo
echo
echo '				'Criando  diretorios  diversos em  
echo '				'sua maquina com comando mkdir
echo         
echo         
sleep 1
echo
echo
echo
echo '				'- criando diretorio /home/$USER/linux
sleep 1
echo
mkdir /home/$USER/linux
sleep 1 
echo
echo '				'- criando diretorio /home/$USER/linux/escritorio
mkdir /home/$USER/linux/escritorio
sleep 1
echo
echo '					'- criando diretorio em /home/$USER/linux/escritorio/calc
mkdir /home/$USER/linux/escritorio/calc
sleep 1
echo
echo '					'- criando diretorio em /home/$USER/linux/escritorio/impress
mkdir /home/$USER/linux/escritorio/impress
sleep 1
echo
echo '					'- criando diretorio em /home/$USER/linux/escritorio/writer
mkdir /home/$USER/linux/escritorio/writer
sleep 1
echo
echo '				'- criando diretorio em /home/$USER/linux/grafico
mkdir /home/$USER/linux/grafico
sleep 1
echo
echo '					'- criando diretorio em /home/$USER/linux/grafico/gimp
mkdir /home/$USER/linux/grafico/gimp
sleep 1
echo
echo '					'- criando diretorio em /home/$USER/linux/grafico/inkscape
mkdir /home/$USER/linux/grafico/inkscape
sleep 1
echo
echo '				'- criando diretorio em /home/$USER/linux/internet
mkdir /home/$USER/linux/internet
sleep 1
echo
echo '					'- criando diretorio em /home/$USER/linux/internet/amsn
mkdir /home/$USER/linux/internet/amsn
sleep 1
echo
echo '					'- criando diretorio em /home/$USER/linux/internet/mozilla
mkdir /home/$USER/linux/internet/mozilla
sleep 1
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Imprimindo arvore de diretorios criados:
sleep 3
echo
echo
tree /home/$USER/linux
sleep 5
echo
echo
echo '				'Criando   arquivo  text.txt   no   diretorio 
echo '                               '/home/$USER/linux utilizando o comando touch
touch /home/$USER/linux/text.txt
sleep 3
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Adicionando as seguintes linhas ao arquivo text.txt
echo
echo '					'Faculdade de Tecnologia de Goias
echo '					'Segurança da Informaçao
echo '					'Bruno Camargo Manso
echo
echo "Faculdade de Tecnologia Senac Goiás" > /home/$USER/linux/text.txt
echo "Segurança da Informaçao" >> /home/$USER/linux/text.txt
echo "Bruno Camargo Manso" >> /home/$USER/linux/text.txt
sleep 3
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Atribuindo permissoes ao arquivo .txt 
echo '				'usando o comando chmod 770
chmod 770 /home/$USER/linux/text.txt
sleep 3
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Copiando o arquivo  /home/$USER/linux/text.txt  para 
echo '				'a pasta /home/$USER/linux/escritorio/calc e renomear
echo '				'o arquivo com um novo nome: planilha.txt usando comando cp
cp /home/$USER/linux/text.txt /home/$USER/linux/escritorio/calc/planilha.txt
sleep 3
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Mudando as permissoes do arquivo planilha.txt
echo '				'para novas permissoes de usuarios usando chmod 744
chmod 744 /home/$USER/linux/escritorio/calc/planilha.txt
sleep 3
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Copiando o  arquivo  planilha.txt  para  a  pasta 
echo '				'/home/$USER/linux/escritorio/impress e renomeando
echo '				'o  arquivo  para  um novo  nome: apresentacao.txt
cp /home/$USER/linux/escritorio/calc/planilha.txt /home/$USER/linux/escritorio/impress/apresentacao.txt
sleep 3
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Mudando as permissoes de usuario do arquivo apresentacao.txt
echo '				'para novas permissoes usando o comando chmod 756
chmod 756 /home/$USER/linux/escritorio/impress/apresentacao.txt
sleep 3
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Mostrando    conteudo    do    arquivo    text.txt
echo '				'usando o comando cat em /home/$USER/linux/text.txt
echo
cat /home/$USER/linux/text.txt
sleep 5
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Mudando o nome do diretorio /gimp
echo '				'para blender usando o comando mv
mv /home/$USER/linux/grafico/gimp /home/$USER/linux/grafico/blender
sleep 3
echo
echo '							'[OK]
echo
sleep 1
echo
echo '				'Imprimindo arvore de com diretorios criados:
sleep 3
echo
echo
tree /home/$USER/linux
sleep 10
echo
echo '				'Limpando arquivos de teste deste scipt.....
echo
echo
sleep 3
clear
echo .
sleep 1
clear
echo ..
sleep 1
clear 
echo ...
sleep 1
clear
echo ....
sleep 1
clear
rm -rf /home/$USER/linux
echo
echo
echo
echo '				'Todos arquivos foram removidos! Até a proxima!
echo
echo
echo
echo






















