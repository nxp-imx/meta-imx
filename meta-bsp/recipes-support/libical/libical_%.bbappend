do_compile:prepend() {
    # This prevents g-ir-scanner from writing cache data to $HOME
    export GI_SCANNER_DISABLE_CACHE=1
}
