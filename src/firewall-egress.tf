resource "google_compute_firewall" "o01-ni-gcp-copy" {
  name = "devsecops-fw-multi-ip-egress"
  network = "devsecops-network-gcp"

  allow {
    protocol = "tcp"
  }

  direction = "EGRESS"
  priority = "2400"
  destination_ranges = [
    "192.168.1.1/32",
    "192.168.1.2/32",
    "192.168.1.3/32",
    "192.168.1.4/32",
    "192.168.1.5/32"]
}