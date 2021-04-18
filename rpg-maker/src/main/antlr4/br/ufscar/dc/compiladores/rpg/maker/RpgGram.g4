grammar RpgGram;

@header {
  import br.ufscar.dc.compiladores.rpg.maker.File;
}

PalavrasChave: 
    'especial' | 'level' | 'Ataque' | 'Defensa' | 'Fuga' | 'Cure' |
    'inicio ' | 'fim '| 'sim' | 'nao' |
    'animago' | 'espadachim' | 'necromante' | 'bardos' | 'Paladino';   

Delimitador: 
    ':';

Abre: 
    '{'| '(' | '[';

Fecha: 
   '}' ')' | ']';

Virgula: 
    ',';

Nome:
    ('A'..'Z')('a'..'z')+ (' ' ('A'..'Z')('a'..'z')+)?;
 
Nivel:
    ('0'..'9')+;

Mana:
    ('0'..'9')+;


EncantamentoAtaque:
    'AtaqueAnimago' | 'AtaqueEspadachim' | 'AtaqueNecromante' | 'AtaqueBardo' | 'AtaquePaladino';

EncantamentoCura:
    'CuraAnimago' | 'CuraEspadachim' | 'CuraNecromante' | 'CuraBardo' | 'CuraPaladino';

EncantamentoFuga:
    'FugaAnimago' | 'FugaEspadachim' | 'FugaNecromante' | 'FugaBardo' | 'FugaPaladino';

EncantamentoDefesa:
    'DefesaAnimago' | 'DefesaEspadachim' | 'DefesaNecromante' | 'DefesaBardo' | 'DefesaPaladino';

programa:
    corpo;
    
corpo:
    declaracao_local+ cmd*; 
    
declaracao_local:
    'inicio'
        Nome ':' classe 
        Nivel ':' 'level' 
        status ':' 'especial'
    'fim';

classe:
    'animago' | 'espadachim' | 'necromante' | 'bardo' | 'Paladino';
    
status:
    'sim' | 'nao';    
    
cmd:
    cmdAtaque | cmdDefenda | cmdFuja | cmdCure;
    
cmdAtaque:
    'Ataque' '(' Nome (',' encantamentoAtaque)+ ')';
    
cmdDefenda:
    'Defenda' '(' Nome (',' encantamentoDefesa)+ ')';

cmdFuja:
    'Fuga' '(' Nome (',' encantamentoFuga)+ ')';
    
cmdCure:
    'Cure' '(' Nome (',' encantamentoCura)+ ')';

encantamentoAtaque:    
    encantamentoAtaqueAnimago | encantamentoAtaqueEspadachim| encantamentoAtaqueNecromante | 
    encantamentoAtaqueBardo | encantamentoAtaquePaladino;

encantamentoDefesa:
    encantamentoDefesaAnimago | encantamentoDefesaEspadachim| encantamentoDefesaNecromante | 
    encantamentoDefesaBardo | encantamentoDefesaPaladino;

encantamentoFuga:
    encantamentoFugaAnimago | encantamentoFugaEspadachim| encantamentoFugaNecromante | 
    encantamentoFugaBardo | encantamentoFugaPaladino;

encantamentoCura:
    encantamentoCuraAnimago | encantamentoCuraEspadachim| encantamentoCuraNecromante | 
    encantamentoCuraBardo | encantamentoCuraPaladino;


encantamentoAtaqueAnimago: 'AtaqueAnimago';
encantamentoDefesaAnimago: 'DefesaAnimago';
encantamentoFugaAnimago:   'FugaAnimago';
encantamentoCuraAnimago:   'CuraAnimago';

encantamentoAtaqueEspadachim:'AtaqueEspadachim';
encantamentoDefesaEspadachim:'DefesaEspadachim';
encantamentoFugaEspadachim:  'FugaEspadachim';
encantamentoCuraEspadachim:  'CuraEspadachim';

encantamentoAtaqueNecromante:'AtaqueNecromante';
encantamentoDefesaNecromante:'DefesaNecromante';
encantamentoFugaNecromante:  'FugaNecromante';
encantamentoCuraNecromante:  'CuraNecromante';

encantamentoAtaquePaladino:'AtaquePaladino';
encantamentoDefesaPaladino:'DefesaPaladino';
encantamentoFugaPaladino:  'FugaPaladino';
encantamentoCuraPaladino:  'CuraPaladino';

encantamentoAtaqueBardo:'AtaqueBardo';
encantamentoDefesaBardo:'DefesaBardo';
encantamentoFugaBardo:  'FugaBardo';
encantamentoCuraBardo:  'CuraBardo';
    
/* Os comentários serão ignorados pelo compilador */
Comentario: 
    '{' ~('\n'|'\r'|'}'|'{')* '\r'? '}' { skip(); };

/* Os espaco em branco serao ignorados pelo compilador */
WhiteSpace: 
    (' ' | '\t' | '\r' | '\n') { skip(); };

/* Comentários não fechados serão gravado como erros */    
ErroComentario: 
    '/*'
    { File.AddString("                    <div id=\"erros\">" + 
                    "Comentario nao fechado.</div>\n");
    File.gravaArquivo(); };

/* Toda regra que não pertença a linguagem será exibida como erro pelo compilador */
ANY: 
    .
    { File.AddString("                    <div id=\"erros\">" + 
                    "Símbolo não identificado</div>\n");
    File.gravaArquivo(); };