# The Xen block tap components are packaged separately here to support
# the option to build them in a separate recipe from xen-tools.

BLKTAP_PACKAGES ?= " \
    ${PN}-blktap \
    ${PN}-libblktap \
    ${PN}-libblktapctl \
    ${PN}-libblktapctl-dev \
    ${PN}-libblktap-dev \
    ${PN}-libvhd \
    ${PN}-libvhd-dev \
    ${PN}-blktap-staticdev \
    "

BLKTAP_PROVIDES ?= " \
    virtual/blktap \
    virtual/libblktap \
    virtual/libblktapctl \
    virtual/libvhd \
    "

BLKTAP_RRECOMMENDS ?= " \
    virtual/blktap \
    virtual/libblktap \
    virtual/libblktapctl \
    virtual/libvhd \
    "

RPROVIDES_${PN}-blktap = "virtual/blktap"
RPROVIDES_${PN}-libblktap = "virtual/libblktap"
RPROVIDES_${PN}-libblktapctl = "virtual/libblktapctl"
RPROVIDES_${PN}-libvhd = "virtual/libvhd"

FILES_${PN}-blktap-staticdev += "\
    ${libdir}/libblktapctl.a \
    ${libdir}/libvhd.a \
    ${libdir}/libblktap.a \
    "

FILES_${PN}-libblktapctl = "${libdir}/libblktapctl.so.*"
FILES_${PN}-libblktapctl-dev = " \
    ${libdir}/libblktapctl.so \
    ${libdir}/pkgconfig/xenblktapctl.pc \
    ${datadir}/pkgconfig/xenblktapctl.pc \
    "

FILES_${PN}-libvhd = "${libdir}/libvhd.so.*"
FILES_${PN}-libvhd-dev = " \
    ${libdir}/libvhd.so \
    ${libdir}/pkgconfig/vhd.pc \
    ${datadir}/pkgconfig/vhd.pc \
    "

FILES_${PN}-libblktap = "${libdir}/libblktap.so.*"
FILES_${PN}-libblktap-dev = " \
    ${libdir}/libblktap.so \
    ${libdir}/pkgconfig/blktap.pc \
    ${datadir}/pkgconfig/blktap.pc \
    "

FILES_${PN}-blktap = "\
    ${sbindir}/blktapctrl \
    ${sbindir}/img2qcow \
    ${sbindir}/lock-util \
    ${sbindir}/qcow2raw \
    ${sbindir}/qcow-create \
    ${sbindir}/tap-ctl \
    ${sbindir}/tapdisk \
    ${sbindir}/tapdisk2 \
    ${sbindir}/tapdisk-client \
    ${sbindir}/tapdisk-diff \
    ${sbindir}/tapdisk-stream \
    ${sbindir}/td-util \
    ${sbindir}/vhd-update \
    ${sbindir}/vhd-util \
    "
