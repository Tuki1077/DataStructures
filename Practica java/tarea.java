import java.util.*;

public class tarea{
    public static void main(String args[]){
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ullamcorper sit amet risus nullam eget felis. Ultrices neque ornare aenean euismod elementum nisi quis eleifend. Nisl nunc mi ipsum faucibus vitae aliquet. Maecenas accumsan lacus vel facilisis volutpat est velit egestas. Risus viverra adipiscing at in tellus. Varius duis at consectetur lorem donec massa sapien faucibus. Quis blandit turpis cursus in hac habitasse platea. Ultricies lacus sed turpis tincidunt id aliquet risus feugiat in. Purus non enim praesent elementum facilisis leo vel fringilla. Ac odio tempor orci dapibus ultrices. Sed id semper risus in hendrerit. Adipiscing vitae proin sagittis nisl rhoncus mattis. Adipiscing elit ut aliquam purus. Leo integer malesuada nunc vel risus commodo viverra maecenas accumsan. Tortor vitae purus faucibus ornare. Sagittis id consectetur purus ut faucibus pulvinar elementum integer enim. In iaculis nunc sed augue lacus viverra vitae. Aliquet bibendum enim facilisis gravida neque convallis a cras. Ante metus dictum at tempor commodo ullamcorper a lacus vestibulum. Risus viverra adipiscing at in tellus. Molestie at elementum eu facilisis sed odio morbi quis commodo. Lorem ipsum dolor sit amet consectetur. Adipiscing vitae proin sagittis nisl rhoncus mattis. Iaculis eu non diam phasellus vestibulum lorem. Rutrum tellus pellentesque eu tincidunt tortor aliquam nulla. Quam adipiscing vitae proin sagittis nisl rhoncus mattis. Elit ullamcorper dignissim cras tincidunt lobortis feugiat vivamus at. Ipsum faucibus vitae aliquet nec. Ullamcorper dignissim cras tincidunt lobortis feugiat vivamus at augue eget. Tellus id interdum velit laoreet id donec ultrices tincidunt arcu. Justo laoreet sit amet cursus sit amet. Viverra suspendisse potenti nullam ac. Vitae congue eu consequat ac felis donec et odio pellentesque. Aenean vel elit scelerisque mauris pellentesque pulvinar pellentesque habitant morbi. Vivamus at augue eget arcu. Donec massa sapien faucibus et molestie ac feugiat sed. Nibh sed pulvinar proin gravida hendrerit lectus. Scelerisque eleifend donec pretium vulputate sapien nec sagittis. Nunc non blandit massa enim nec dui nunc. Et netus et malesuada fames ac turpis egestas. Vestibulum sed arcu non odio. Convallis aenean et tortor at risus viverra adipiscing at. Viverra justo nec ultrices dui sapien eget mi. Faucibus et molestie ac feugiat. Quis blandit turpis cursus in hac habitasse platea. Tempus egestas sed sed risus pretium quam vulputate dignissim. Urna neque viverra justo nec. Etiam non quam lacus suspendisse faucibus interdum. Facilisis leo vel fringilla est ullamcorper eget nulla facilisi. Cursus mattis molestie a iaculis. Non odio euismod lacinia at quis. Mauris vitae ultricies leo integer. Bibendum at varius vel pharetra vel turpis. Urna et pharetra pharetra massa massa ultricies mi quis. Dignissim sodales ut eu sem integer vitae. Et sollicitudin ac orci phasellus egestas tellus rutrum tellus pellentesque. Tempor commodo ullamcorper a lacus vestibulum sed arcu non odio. Quis imperdiet massa tincidunt nunc pulvinar sapien. Et malesuada fames ac turpis. Proin libero nunc consequat interdum varius sit amet. Non sodales neque sodales ut etiam. Dictum varius duis at consectetur lorem donec. Amet porttitor eget dolor morbi non arcu risus quis varius. Dolor sit amet consectetur adipiscing elit. Eu turpis egestas pretium aenean pharetra. Egestas quis ipsum suspendisse ultrices. Ultricies leo integer malesuada nunc vel risus commodo. Egestas fringilla phasellus faucibus scelerisque eleifend donec pretium. Habitant morbi tristique senectus et netus. Risus commodo viverra maecenas accumsan lacus. Euismod elementum nisi quis eleifend quam adipiscing vitae proin sagittis. Amet commodo nulla facilisi nullam vehicula ipsum a arcu. Urna condimentum mattis pellentesque id nibh tortor id aliquet. Integer eget aliquet nibh praesent tristique magna. Volutpat commodo sed egestas egestas fringilla phasellus faucibus. Malesuada bibendum arcu vitae elementum curabitur vitae nunc sed velit. Vulputate dignissim suspendisse in est ante in nibh.";
        int contadorA = 97;
        letra[] letter = new letra[26];
        for (int j = 0; j < 26; j++){
            letter[j] = new letra((char)contadorA);
            
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) == (char)contadorA){
                    letter[j].n++;
                    }
                }
                contadorA++;
            }
            Arrays.sort(letter);
            letra[] t10 = new letra[10];
            System.arraycopy(letter, 0, t10, 0, 10);

            for(int t = 0; t < 10; t++){    
                System.out.print("\n" + letter[t].letras +": " + letter[t].n);
                for (int h = 0; h < t10[t].n; h++){
                    System.out.print(" * ");
                }
        }
    }
}