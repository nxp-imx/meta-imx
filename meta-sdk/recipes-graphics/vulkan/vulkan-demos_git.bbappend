FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://0001-Modify-parameter-in-vulkan-demo-computenbody.patch \
    file://0001-Fix-bug-in-computeheadless-and-renderheadless.patch \
"
