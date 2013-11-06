SUMMARY = "GL Compositing Benchmark"
DESCRIPTION = "A benchmark for GL(ES)2 based compositing operations"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=f27defe1e96c2e1ecd4e0c9be8967949"

DEPENDS += "virtual/egl virtual/libgl virtual/libgal-x11 virtual/egl virtual/libgles1 virtual/libgles2 "

inherit pkgconfig

do_configure () {
     ./waf configure
}

do_compile () {
     ./waf build  ${PARALLEL_MAKE}
}

do_install () {
     install -d ${D}/${exec_prefix}/local
     install -d ${D}/${exec_prefix}/local/share
     install -d ${D}/${exec_prefix}/local/share/glcompbench
     install -d ${D}/${exec_prefix}/local/share/man
     install -d ${D}/${exec_prefix}/local/share/man/man1
     install -d ${D}/${exec_prefix}/local/bin
     install -d ${D}/${exec_prefix}/local/bin/.debug

     ./waf install --destdir=${D}
}

FILES_${PN}-dbg += "${exec_prefix}/local/bin/.debug/glcompbench-egl-es2"
FILES_${PN}-dev += "${exec_prefix}/local/share/glcompbench/*"
FILES_${PN} += "${exec_prefix}/local/share/glcompbench/* \
                ${exec_prefix}/local/share/man/man1/gl-composite-benchmark.1 \
                ${exec_prefix}/local/share/man/man1/glcompbench-egl-es2.1 \
                ${exec_prefix}/local/bin/gl-composite-benchmark \
                ${exec_prefix}/local/bin/glcompbench-egl-es2"
