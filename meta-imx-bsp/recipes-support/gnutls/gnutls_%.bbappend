PACKAGECONFIG:append = " p11-kit"

# Prevent debian.bbclass from dynamically renaming nativesdk-gnutls-dev to
# nativesdk-libgnutls-dev. allarch packagegroups (like nativesdk-packagegroup-sdk-host)
# cannot depend on dynamically renamed packages, so we pin the nativesdk-dev package
# name to its original OE name to keep it stable.
DEBIANNAME:${PN}-dev:class-nativesdk = "${PN}-dev"
