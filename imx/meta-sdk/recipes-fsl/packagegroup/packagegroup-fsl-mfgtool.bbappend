# Add extra tools needed for Android mfgtools

RDEPENDS_${PN}-base += " \
    simg2img \
"

RDEPENDS_${PN}-extfs += " \
    e2fsprogs \
    f2fs-tools \
"
