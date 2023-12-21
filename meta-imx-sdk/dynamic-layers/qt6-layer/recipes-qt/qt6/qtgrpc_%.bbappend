FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://0001-Fix-include-of-std-set.patch \
    file://0002-Remove-call-to-protobuf-FileDescriptor-syntax.patch \
"
