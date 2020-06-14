def cifraCesar(mensagem, chave):
    mensagemCifrada = ''
    for letra in mensagem:
        if letra != " ":
            valorLetra = ord(letra) - ord('a')
            valorNovaLetra = (valorLetra + int(chave)) % 26 + ord('a')
            mensagemCifrada += chr(valorNovaLetra)
        else:
            mensagemCifrada = mensagemCifrada + " "
    return mensagemCifrada

def decifraCesar(mensagemCifrada, chave):
    mensagemOriginal = ''
    for letra in mensagemCifrada:
        if letra != " ":
            valorLetra = ord(letra) - ord('a')
            valorNovaLetra = (valorLetra - int(chave)) % 26 + ord('a')
            mensagemOriginal += chr(valorNovaLetra)
        else:
            mensagemOriginal = mensagemOriginal + " "
    return mensagemOriginal    


textoCifrado = input("Digite a mensagem cifrada: ")
#k = input("Digite o valor da chave (K):")
#textoCifrado = cifraCesar(texto,k)
#print (textoCifrado)
#textoDecifrado = decifraCesar(textoCifrado, k)
#print (textoDecifrado)

print("Brute force da mensagem:", textoCifrado)
for chave in range (1, 25):
    testeChave = decifraCesar(textoCifrado, chave)
    print ("K = ", chave, ": " , testeChave)



















