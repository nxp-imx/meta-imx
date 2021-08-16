do_compile:prepend() {
    # Packages are downloaded during the build so the proxy is needed
    export http_proxy=${http_proxy}
    export https_proxy=${https_proxy}
}
