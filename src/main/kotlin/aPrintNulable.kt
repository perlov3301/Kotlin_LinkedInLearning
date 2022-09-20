fun aPrintNulable() {
    print("aPrintNulable; length of 'kotlin' is ")
    var aNulable1: String? = "kotlin"
    println(aNulable1?.length?:"THE Value is null")
}