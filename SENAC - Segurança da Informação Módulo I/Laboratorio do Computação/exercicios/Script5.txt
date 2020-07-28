#!/bin/bash
echo 
echo 
mkdir /home/$USR/treino
mkdir /home/$USR/treino/home
mkdir /home/$USR/treino/home/senac
mkdir /home/$USR/treino/arquivos
mkdir /home/$USR/treino/home/senac/brunoManso
mkdir /home/$USR/treino/home/senac/brunoManso/labComputacao
mkdir /home/$USR/treino/home/senac/brunoManso/algoritmos
mkdir /home/$USR/treino/home/senac/backup

tree /home/$USR/treino
sleep 2
touch /home/$USR/treino/home/senac/brunoManso/labComputacao/comandosLinux.txt
echo
echo -e 'Lista de 30 comandos que aprendi no Linux:' > /home/$USR/treino/home/senac/brunoManso/labComputacao/comandosLinux.txt
echo -e '

$ mkdir'	'-Cria um diretorio

\n$ apt-get install'	'-Instala um determinado programa quando esse comando é usado juntamente com o nome dele

\n$ apt-get-update'	'-Atualiza o sistema de arquivo do Linux

\n$ ls'	'-Lista os aquivos da pasta  

\n$ chmod'	'-Modifica as permissões de arquivos e pastas 

\n$ touch'	'-Cria um arquivo vazio quando esse comando é usado juntamente com um nome e com uma extensao de arquivos 

\n$ rm'	'-Remove arquivos e diretorios

\n$ mv'	'-Move arquivos e diretorios

\n$ cp'	'-Copia arquivos e diretorios 

\n$ exit'	'-Fecha o terminal

\n$ man'	'-Abre o manual de um determinado programa

\n$ reboot'	'-Reinicia a maquina 

\n$ halt'	'-Coloca a maquina em suspensão 

\n$ clear'	'-Limpa o terminal 

\n$ uname'	'-Mostra informação sobre o Sistema 

\n$ cat'	'-Mostra o conteudo de um determinado arquivo

\n$ history'	'-Mostra todos os comandos anteriormente digitados no terminal de comando 

\n$ usaradd'	'-Adiciona um usuario  
 
\n$ userdel'	'-Deleta um usuario 

\n$ passwd'	'-Insere um password quando esse comando é usado juntamente com um nome de usuario

\n$ su'	'-Muda o usuario e tambem para um superusuario

\n$ whoami'	'-Mostra o nome do usuario atual

\n$ addgroup'	'-Adiciona um novo grupo

\n$ free'	'-Mostra quantidade de memoria livre no sistema 

\n$ memstat'	'-Lista os processos que estao utilizando memoria virtual

\n$ pmap'	'-Mostra o consumo de memoria no sistema de um processo ou de processos multiplos 

\n$ nmap'	'-Programa para auditar uma Rede 

\n$ ps'	'-Mostra informacao sobre uma selecao de processos ativos

\n$ kill'	'-Encerra determinado processo

\n$ killall'	'-Encerra todos os processos possiveis

' >>  /home/$USR/treino/home/senac/brunoManso/labComputacao/comandosLinux.txt

cat /home/$USR/treino/home/senac/brunoManso/labComputacao/comandosLinux.txt

touch /home/$USR/treino/arquivos/respostas3.txt
echo -e '
\n$ ps -u'	'-Lista todos os processos de usuário do terminal corrente. 

\n$ ps -ef'	'-Lista os processos que estão em execução em todos os terminais. 

\n$ ps -e'	'-Lista todos os processos do sistema operacional. 

\n$ ps aux --sort=-pcpu,+pmem,etime'	'Visualizar os processos que estão consumindo mais recursos da CPU, 

\n$ chmod 777 /home/senac/brunoManso/labComputacao/comandoslinux.txt'	'-Altera as permissões de acesso do arquivo 

\n$ pstree -u -p'	'-Lista os processos em forma de árvore, exibindo o número do processo e o nome do usuário.

'> /home/$USR/treino/arquivos/respostas3.txt

cat /home/$USR/treino/arquivos/respostas3.txt

chmod 700 /home/$USR/treino/arquivos/respostas3.txt

touch /home/$USR/treino/arquivos/kill.txt

echo -e '

\n$ Kill    > Envia sinais a determinados processos em execução. Por padrão é enviado o sinal SIGTERM que requisita a finalização do processo,por isso o nome kill (matar)

\n$ Killall > Comando mata um processo pelo seu nomw 

\n$ pkill   > Manda um sinal a todos processos que tenham como linha de comando um determinado padrão\n' > /home/$USR/treino/arquivos/kill.txt

cat /home/$USR/treino/arquivos/kill.txt

tree /home/$USR/treino
echo
echo
sleep 2
rm -rf   mkdir /home/$USR/treino
echo -e "\n\t Apagando todos arquivos...."
sleep 2
echo -e "\n\t\t\t [ok]\n\n"
sleep 1


