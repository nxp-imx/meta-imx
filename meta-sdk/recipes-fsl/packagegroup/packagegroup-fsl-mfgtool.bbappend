# Add extra tools needed for Android mfgtools

RDEPENDS_${PN}-base += " \
    simg2img \
    gptfdisk \
    hdparm \
    iproute2 \
    nfs-utils \
"

RDEPENDS_${PN}-extfs += " \
    e2fsprogs \
    f2fs-tools \
"
