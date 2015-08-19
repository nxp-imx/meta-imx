require fsl-image-core.bb

SUMMARY = "Large image to be used for development and evaluation"
DESCRIPTION = "Large image which includes all the tested tools and \
Freescale-specific packages. It is a full Linux system rather than \
an embedded system for development and evaluation tasks."

LICENSE = "MIT"

# copy the manifest and the license text for each package to image
COPY_LIC_MANIFEST = "1"

IMAGE_INSTALL_append = " \
    packagegroup-core-buildessential \
    packagegroup-core-eclipse-debug \
    packagegroup-core-full-cmdline \
    packagegroup-core-nfs-server \
    packagegroup-core-tools-debug \
    packagegroup-fsl-networking-extended \
    packagegroup-fsl-tools-audio \
    packagegroup-fsl-virtualization \
    packagegroup-fsl-devtools \
    packagegroup-fsl-benchmark-extended \
    packagegroup-fsl-tools-extended \
    packagegroup-fsl-tools-bluetooth \
    packagegroup-fsl-graphics-benchmarks \
    packagegroup-fsl-graphics-demos \
    packagegroup-fsl-graphics-tools \
    packagegroup-fsl-gstreamer1.0 \
"

export IMAGE_BASENAME = "fsl-image-full"

