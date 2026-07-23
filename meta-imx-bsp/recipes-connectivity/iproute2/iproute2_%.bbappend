do_install:append:imx-generic-bsp () {
    cp -Rf --no-preserve=ownership ${B}/include/* ${D}${includedir}
}

do_install:append:qoriq-generic-bsp () {
    cp -Rf --no-preserve=ownership ${B}/include/* ${D}${includedir}
}
