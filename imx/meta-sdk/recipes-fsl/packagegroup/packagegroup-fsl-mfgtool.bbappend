# Add extra tools

RDEPENDS_${PN}-base += " \
    simg2img \
"

RDEPENDS_${PN}-extfs += " \
    e2fsprogs \
    e2fsprogs-e2fsck \
    f2fs-tools \
"
