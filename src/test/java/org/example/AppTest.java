/**
 * package co.edu.escuelaing.arsw.countLines;
 *
 * import java.io.BufferedReader;
 * import java.io.IOException;
 * import java.nio.charset.Charset;
 * import java.nio.file.Files;
 * import java.nio.file.Path;
 * import java.nio.file.Paths;
 *
 * public class counter {
 *      Metodo el cual lee el archivo teniendo en cuenta la validacion y realiza el conteo de lineas
 *      @param filePath archivo en el cual se va a realizar el conteo
 *      @param filetype tipo del archivo, el cual puede ser "phy" o "loc"
 *      @return un numero entero el cual es el resultado del numero de lineas
 *      public static int countlines(String filePath,String filetype){
 *      Path file=Paths.get(filePath);
        *int numberofLines=0;
        *
        *Charset charset=Charset.forName("UTF-8");
        *try(BufferedReader reader=Files.newBufferedReader(file,charset)){
        *String line=null;
        *while((line=reader.readLine())!=null){
        *if(filetype.equals("phy")){
        *numberofLines+=1;
        *}
        *if(filetype.equals("loc")&&(!confirmlines(line))){
        *numberofLines+=1;
        *}
        *}
        *}catch(IOException x){
        *System.err.format("IOException: %s%n",x);
        *}
        *return numberofLines;
        *}
        *
        *     /**
 *      * Metodo el cual confirma si la linea es vacia o comentario
 *      * @param line linea a revisar
 *      * @return true en caso de ser una de estas y false de no serlo
 *
        *public static boolean confirmlines(String line){
        *if(line.isEmpty()){
        *return true;
        *}
        *if(line.contains("//")||line.contains("/**")||line.contains("")||line.contains("*")){
        *return true;
        *}
        *return false;
        *}
        *}
 */