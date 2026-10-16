package main.chainofResposibility;

enum LogLevels {
    INFO(1),
    DEBUG(2),
    WARN(3);

    int levels;

    LogLevels(int i) {
    }

    public int getLevels(){
        return this.levels;
    }

}
