package secondTask

//Preventing running without parameter
if(!args[0]){
    println "You should pass a path to folder in first param"
    return
}

def dir = new File(args[0])

if(!dir.exists() || !dir.isDirectory()){
    println "Dir $dir.absolutePath does not exist or isn't a directory"
    return
}

dir.eachFileRecurse { file ->
    if(file.name.startsWith("a_")){
        def aNumber = file.text.findAll('a').size()
        file.text += "\n Number of a's in this file = $aNumber"
        file.renameTo file.getParentFile().absolutePath+"/done_"+file.name
    }

    if(file.name.startsWith("1_")){
        def rand = new Random()
        def matrix = [];
        def diagonal = 0, backDiagonal = 0
        for(def i=0; i<4; i++){
            matrix[i] = []
            for(def j=0; j<4; j++){
                matrix[i][j] = rand.nextInt(10)
                if( i == j){
                    diagonal += matrix[i][j]
                }
                if( i == 3-j){
                    backDiagonal += matrix[i][j]
                }

            }
        }

        file.text = ""

        matrix.each { innerMatrix ->
           file.append innerMatrix
           //Some strange bug with file.append innerMatrix+"\n"
           file.append "\n"
        }
        file.append "Diagonal summ = $diagonal\n"
        file.append "Back diagonal summ = $backDiagonal\n"

        file.renameTo file.getParentFile().absolutePath+"/done_"+file.name
    }

    if(file.name.startsWith("d_")){
        file.text = new Date().format("yyyy-MM-dd HH-mm-ss")
        file.renameTo file.getParentFile().absolutePath+"/done_"+file.name
    }
}

