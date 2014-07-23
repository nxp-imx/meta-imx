# Append path for freescale layer to include bsp pointercal.xinput
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# FIXME: The version on the daisy branch has the wrong format at the end line of the file.
#        So fix it by a new verison of pointercal.xinput
SRC_URI_mx6 += "file://pointercal.xinput.new"

do_install_mx6() {
    # Only install file if it has a contents
    if [ -s ${S}/pointercal.xinput.new ] &&\
       [ ! -n "$(head -n1 ${S}/pointercal.xinput.new|grep "replace.*pointercal\.xinput")" ]; then
        install -d ${D}${sysconfdir}/
        install -m 0644 ${S}/pointercal.xinput.new ${D}${sysconfdir}/pointercal.xinput
    fi
}
